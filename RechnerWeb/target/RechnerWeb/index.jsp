<%@page import="de.ziad.rechner.RechnerMetier"%>
<%
double a=0; double b=0; double erg=0;
String action=request.getParameter("action");
if(action!=null){
a=Double.parseDouble(request.getParameter("a"));
b=Double.parseDouble(request.getParameter("b"));
RechnerMetier metier= new RechnerMetier();
if(action.equals("Summe")){
 erg=metier.summe(a,b);
 }
 else{
 erg=metier.produkt(a,b);
 }
}
%>
 <html>
 <body>
 <form action="index.jsp" method="post">
 <table>
 <tr>
 <td>A:</td><td><input type="text" name="a" value="<%=a%>"/></td>
 <td>B:</td><td><input type="text" name="b" value="<%=b%>"/></td>
 </tr>
 <tr>
 <td><input type="submit" value="Summe" name="action"/></td>
 <td><input type="submit" value="Produkt" name="action"/></td>
 </tr>
 <tr>
 <td>Ergebniss:</td> <td><%=erg%></td>
 </tr>
 </table>
  </form>
 </body>
 </html>