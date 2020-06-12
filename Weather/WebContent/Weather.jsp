<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page
	import="weather.util.Util,weather.open.OpenWeatherDataCollector,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather</title>
</head>
<%
int reqType = Util.strToInt(request.getParameter("req_type"), 0);
String latitude = Util.formatString(request.getParameter("latitude"), "NA");
String longitude = Util.formatString(request.getParameter("longitude"), "NA");
OpenWeatherDataCollector openWeatherDataCollector=new OpenWeatherDataCollector();

%>
<body>
<center>
<table border=1>
<%if((!latitude.equalsIgnoreCase("NA")) && (!longitude.equalsIgnoreCase("NA"))){
	ArrayList<String> resp=openWeatherDataCollector.getWeatherData(latitude, longitude);
	if(resp.get(0).equalsIgnoreCase("1")){
		%>
		<tr>
		<td>Name : </td>
		<td><%=resp.get(1)%></td>
		</tr>
		<tr>
		<td>Temprature :</td>
		<td><%=resp.get(2)%>&#8451;</td>
		</tr>
		<tr>
		<td>Temprature Min :</td>
		<td><%=resp.get(3)%>&#8451;</td>
		</tr>
		<tr>
		<td>Temprature Max:</td>
		<td><%=resp.get(4)%>&#8451;</td>
		</tr>
		<tr>
		<td>Temprature Feels:</td>
		<td><%=resp.get(5)%>&#8451;</td>
		</tr>
		<tr>
		<td>Pressure : </td>
		<td><%=resp.get(6)%></td>
		</tr>
		<tr>
		<td>Humidity :</td>
		<td><%=resp.get(7)%></td>
		</tr>
		<tr>
		<td>Visibility :</td>
		<td><%=resp.get(8)%></td>
		</tr>
		<tr>
		<td>Wind Speed :</td>
		<td><%=resp.get(9)%></td>
		</tr>
		<%
	}else{
		%>
		<tr>
		<td>Message From Server:</td>
		<td><%=resp.get(1)%></td>
		</tr>
		<%
	}
	
}%>
</table>
<table><tr>
<td> <a href="About.jsp">About</a></td>
<td> | </td>
<td> <a href="GeoLocation.jsp">GeoLocation</a></td>
</center>
</body>
</html>