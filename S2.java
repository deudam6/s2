import java.util.*; 
public class GFG
{ 
    public static void main(String args[]) 
    { 
        HashSet<String> set = new HashSet<String>(); 
        set.add("geeks"); 
        set.add("practice"); 
        set.add("contribute"); 
        set.add("ide"); 
        System.out.println("Original HashSet: "+ set);
        List<String> list = new ArrayList<String>(set); 
        Collections.sort(list); 
        System.out.println("HashSet elements "+ "in sorted order" +"using List: "+ list); 
    } 
}


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class NewServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException
    {
    resp.setContentType("text/html");
    String userinfo=req.getHeader("User-Agent");
    PrintWriter p=resp.getWriter(); 
    } 
}
<html> 
<body>
<form action="http://localhost:8080/serv/NewServlet" method="get">
Username:<input type="text" name="t1">
<input type="submit" >
</form>
</body>
</html>