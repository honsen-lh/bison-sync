package com.leaderment.test;

import java.io.IOException;
import java.lang.reflect.Field;

import com.google.common.base.CaseFormat;

public class GenerateSqlMapperUtil {
	public static void main(String[] args) throws IOException {
        generateSqlMapper(com.leaderment.mysql_pojo.Supplier.class, null);
    }
 
	
	public static void generateSqlMapper(Class obj,String tableName) throws IOException{
        Field[] fields = obj.getDeclaredFields();
        String param = null;
        String cameCaseColumn = null;
        String underScoreCaseColumn = null;
        StringBuilder sql = new StringBuilder();
        if(tableName==null||tableName.equals("")){
            // 未传表明默认用类名
            tableName = obj.getName().substring(obj.getName().lastIndexOf(".")+1);
        	
        	tableName = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, tableName);
        }
        /**
         * 以下部分生成建表Sql
         */
        sql.append("drop table if exists ").append(tableName).append(";\r\n");
        sql.append("create table ").append(tableName).append("( \r\n");
        boolean firstId = true;
        for(Field f : fields){
            cameCaseColumn = f.getName();
            underScoreCaseColumn = cameCaseColumn;
            underScoreCaseColumn = CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, underScoreCaseColumn);
            /*for(int i = 0; i < cameCaseColumn.length(); i++)
                if(Character.isUpperCase(cameCaseColumn.charAt(i)))
                    // 将javabean中小驼峰命名变量的“大写字母”转换为“_小写字母”
                    underScoreCaseColumn = cameCaseColumn.substring(0, i) + '_' + cameCaseColumn.substring(i, i+1).toLowerCase() + cameCaseColumn.substring(i+1, cameCaseColumn.length());
            */
            sql.append(underScoreCaseColumn).append(" ");
            param = f.getType().getTypeName();
            if(param.equals("java.lang.Integer")){
                sql.append("INTEGER");
            }else if(param.equals("java.util.Date")){
            	sql.append("TIMESTAMP");
            }else if(param.equals("java.lang.Byte")){
            	sql.append("TINYINT(4)");
            }else if(param.equals("java.lang.Float")){
            	sql.append("FLOAT");
            }else if(param.equals("java.math.BigDecimal")){
            	sql.append("DECIMAL(10,2)");
            }else if(param.equals("java.lang.Short")){
            	sql.append("SMALLINT");
            }else if(param.equals("java.lang.Boolean")){
            	sql.append("TINYINT(1)");
            }else if(param.equals("java.lang.Long")){
            	sql.append("BIGINT");
            }else if(param.equals("java.lang.Double")){
            	sql.append("DOUBLE");
            }else{
                // 根据需要自行修改
                sql.append("VARCHAR(45)");
            }
            if(firstId){
                // 默认第一个字段为ID主键
                sql.append(" PRIMARY KEY");
                firstId = false;
            }
            sql.append(",\n");
        }
        sql.delete(sql.lastIndexOf(","), sql.length()).append("\n)ENGINE=INNODB DEFAULT CHARSET=UTF8;\r\n");
        System.out.println(sql);
	}
}
