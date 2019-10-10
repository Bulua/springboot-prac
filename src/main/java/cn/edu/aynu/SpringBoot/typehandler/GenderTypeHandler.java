package cn.edu.aynu.SpringBoot.typehandler;

import cn.edu.aynu.SpringBoot.entity.Gender;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//声明在数据库中的类型
@MappedJdbcTypes(JdbcType.INTEGER)
//声明在实体类中的类型
@MappedTypes(Gender.class)
public class GenderTypeHandler extends BaseTypeHandler<Gender> {

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Gender gender, JdbcType jdbcType) throws SQLException {
        ps.setInt(i, gender.getId());
    }

    /**
     *
     * @param rs    结果集HikariProxyResultSet@25047384 wrapping com.mysql.cj.jdbc.result.ResultSetImpl@f782cc
     * @param columnName    要转换的属性在数据库中的列名  columnName:gender
     */
    @Override
    public Gender getNullableResult(ResultSet rs, String columnName) throws SQLException {
        //在这里结果集中属性gender的值为1/0
        int sex = rs.getInt(columnName);
        if (sex == 1 || sex == 0){
            return Gender.getGenderById(sex);
        }
        return null;
    }

    /**
     *
     * @param rs    结果集HikariProxyResultSet@25047384 wrapping com.mysql.cj.jdbc.result.ResultSetImpl@f782cc
     * @param columnIndex   要转换的属性在数据库中的列名  columnName:gender
     */
    @Override
    public Gender getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        int sex = rs.getInt(columnIndex);
        if (sex == 1 || sex == 0){
            return Gender.getGenderById(sex);
        }
        return null;
    }

    /**
     *
     * @param cs
     * @param columnIndex
     */
    @Override
    public Gender getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        int sex = cs.getInt(columnIndex);
        if (sex == 1 || sex == 0){
            return Gender.getGenderById(sex);
        }
        return null;
    }
}
