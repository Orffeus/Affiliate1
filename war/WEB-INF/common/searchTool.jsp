<form action="/views/search" method="get">
	<% if (request.getParameter("country")!=null) { %>
		<input type="hidden" name="country" value="<%= request.getParameter("country") %>">
	<% } %>
	<% if (request.getParameter("region")!=null) { %>
		<input type="hidden" name="region" value="<%= request.getParameter("region") %>">
	<% } %>
	<% if (request.getParameter("place")!=null) { %>
		<input type="hidden" name="place" value="<%= request.getParameter("place") %>">
	<% } %>	
	<div>
		<span><b>Facilities</b></span><br>
		<span>
			<input type="checkbox" name="aircondition" <%if ( ("on").equals(request.getParameter("aircondition")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >air condition<br>
			<input type="checkbox" name="dishwasher" <%if ( ("on").equals(request.getParameter("dishwasher")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >dishwasher<br>
			<input type="checkbox" name="washingmachine" <%if ( ("on").equals(request.getParameter("washingmachine")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >washing machine<br>
			<input type="checkbox" name="parking" <%if ( ("on").equals(request.getParameter("parking")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >parking<br>
			<input type="checkbox" name="pool" <%if ( ("on").equals(request.getParameter("pool")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >pool<br>
			<input type="checkbox" name="sauna" <%if ( ("on").equals(request.getParameter("sauna")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >sauna<br>
			<input type="checkbox" name="tv" <%if ( ("on").equals(request.getParameter("tv")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >tv<br>
			
			<!-- 
			<input type="checkbox" name="tennis" <%if ( ("on").equals(request.getParameter("tennis")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >tennis<br>
			<input type="checkbox" name="wheelchair" <%if ( ("on").equals(request.getParameter("wheelchair")) ) { out.print("checked=\"checked\""); } else { out.print(""); } %> >wheel chair
			-->
		</span>
	</div>
	<div>
		<span><b>Quality</b></span><br>
		<span>
			<select name="quality">
				<option value="15" <%if (request.getParameter("quality")==null || ("15").equals(request.getParameter("bathrooms"))) { out.print("selected=\"selected\""); } else { out.print(""); } %> >1-5 stars</option>
				<option value="12" <%if ( ("12").equals(request.getParameter("quality")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >1-2 stars</option>
				<option value="23" <%if ( ("23").equals(request.getParameter("quality")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >2-3 stars</option>
				<option value="34" <%if ( ("34").equals(request.getParameter("quality")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >3-4 stars</option>
				<option value="45" <%if ( ("45").equals(request.getParameter("quality")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >4-5 stars</option>
			</select>
		</span>
	</div>
	<div>
		<span><b>Bedrooms</b></span><br>
		<span>
			<select name="bathrooms">
				<option value="1" <%if (request.getParameter("bedrooms")==null || ("1").equals(request.getParameter("bathrooms"))) { out.print("selected=\"selected\""); } else { out.print(""); } %> >1+</option>
				<option value="2" <%if ( ("2").equals(request.getParameter("bedrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >2+</option>
				<option value="3" <%if ( ("3").equals(request.getParameter("bedrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >3+</option>
				<option value="4" <%if ( ("4").equals(request.getParameter("bedrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >4+</option>
			</select>
		</span>
	</div>
	<div>
		<span><b>Bathrooms</b></span><br>
		<span>
			<select name="bathrooms">
				<option value="1" <%if (request.getParameter("bathrooms")==null || ("1").equals(request.getParameter("bathrooms"))) { out.print("selected=\"selected\""); } else { out.print(""); } %> >1+</option>
				<option value="2" <%if ( ("2").equals(request.getParameter("bathrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >2+</option>
				<option value="3" <%if ( ("3").equals(request.getParameter("bathrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >3+</option>
				<option value="4" <%if ( ("4").equals(request.getParameter("bathrooms")) ) { out.print("selected=\"selected\""); } else { out.print(""); } %> >4+</option>
			</select>
		</span>
	</div>
	<input type="submit" value="odeslat">
</form>