<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  </head>
  <body>
    <h1>customer</h1><br/>
    <form method="post" action="/springmvc/showform">
      <table>
        <tr>
          <td>user ID</td>
          <td><input type="text" name="userId" size="10"/></td>
        </tr>
        <tr>
          <td>name </td>
          <td><input type="text" name="userName" size="10"/></td>
        </tr>
        <tr>
          <td>password </td>
          <td><input type="password" name="passwd" size="10"/></td>
        </tr>
        <tr>
          <td>nickname </td>
          <td><input type="text" name="nickname" size="10"/></td>
        </tr>
        <tr>
          <td>gender</td>
          <td><input type="radio" name="gender" value="male"/>male
              <input type="radio" name="gender" value="female"/>female</td>
        </tr>
        <tr>
          <td>JOB</td>
          <td><select name="job">
                <option value="salary">Salary</option>
                <option value="houseKeeper" selected >HouseKeeper</option>
                <option value="student">Student</option>
                <option value="other">Other</option>
              </select></td>
        </tr>
        
      </table><p/>
      <input type="submit" value="입력완료"/>
      <input type="reset" value="재입력"/>
    </form>
  </body>
</html>