
<h1>Horizontal CSS Navigation Menu</h1>

<% String actualPage = "" + request.getAttribute("javax.servlet.forward.request_uri"); %>

 
<p>request_uri: <% out.print(actualPage); %> </p>


<hr />
<div id="stylefour">
<ul>
	<li><a href="../index.jsp" <% if(actualPage.equals("../index.jsp")) out.print("class=\"current\""); %>>Home</a></li>
	<li><a href="/views/personsList" <% if(actualPage.equals("/views/personsList")) out.print("class=\"current\""); %> >Persons List</a></li>
	<li><a href="/views/hello" <% if(actualPage.equals("/views/hello")) out.print("class=\"current\""); %> >Hello</a></li>
	<li><a href="/views/login" <% if(actualPage.equals("/views/login")) out.print("class=\"current\""); %> >Login</a></li>
</ul>
</div>