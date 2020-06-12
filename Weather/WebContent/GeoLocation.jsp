<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page
	import="weather.util.Util,weather.data.PlaceAPIDataCollector,java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GeoLocation</title>
</head>
<%
	int reqType = Util.strToInt(request.getParameter("req_type"), 0);
	String place = Util.formatString(request.getParameter("place"), "NA");
	PlaceAPIDataCollector placeAPIDataCollector = new PlaceAPIDataCollector();
%>
<body>
	<form action="" method="GET">
		Place: <input type="text" name="place"> <br /> <input
			type="submit" value="Submit" /> <input type="hidden" name="req_type"
			value="1" />
	</form>
	<%
		if (reqType == 1 && !place.equalsIgnoreCase("NA")) {
			ArrayList<String> placeAPIPresponse = placeAPIDataCollector.getPlaceData(place);
			if (placeAPIPresponse.get(0).equalsIgnoreCase("0")) {
	%>
	<table>
		<tr>
			<td>Place Name</td>
			<td><%=placeAPIPresponse.get(1)%></td>
		</tr>
		<tr>
			<td>Lat :</td>
			<td><%=placeAPIPresponse.get(2)%></td>
		</tr>
		<tr>
			<td>Long :</td>
			<td><%=placeAPIPresponse.get(3)%></td>
		</tr>
		<tr>
			<td>Long :</td>
			<td><a href="Weather.jsp?latitude=<%=placeAPIPresponse.get(2)%>&longitude=<%=placeAPIPresponse.get(3)%>">Get Weather Info</a></td>
		</tr>
	</table>
	<%
		} else {
	%>
	<table>
		<tr>
			<td>Query For</td>
			<td><%=place%></td>
		</tr>
		<tr>
			<td>Response Message :</td>
			<td><%=placeAPIPresponse.get(4)%></td>
		</tr>
	</table>
	<%
		}
		}
	%>
</table>
<table><tr>
<td> <a href="About.jsp">About</a></td>
<td> | </td>
<td> <a href="GeoLocation.jsp">GeoLocation</a></td>
</tr></table>
</center>
</body>
</html>