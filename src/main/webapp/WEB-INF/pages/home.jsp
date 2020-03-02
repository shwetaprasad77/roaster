<%@ page language="java" contentType="text/html; charset=US-ASCII"
import="java.util.*"%>
<%@ include file="include.jsp"%>
<%-- <%@ include file="/WEB-INF/css/homestyle.css"%> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<title>Home</title>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/css/datepicker.css"
	rel="stylesheet" type="text/css" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.js"></script>
<style>
.button{
              padding: 2em;
              margin-left: 10px;
  margin-right: 10px;
   font-family: Raleway-SemiBold;
  font-size: 13px;
  letter-spacing: 1px;
  line-height: 15px;
  transition: all 0.3s ease 0s;
  grid-template-columns: 2fr 2fr 2fr;
}
#datepicker1, #datepicker2 {
      width: 180px;
      margin: 0 20px 20px 20px;
}
.rad-date {
  display: grid;
  grid-template-columns: 2fr 2fr 2fr;
  grid-gap: 5px;
  max-width: 800px;
  margin-top: 3rem;
  margin-left: 1rem;
}
  .dropdown > select {
    width: 13rem;
    padding: 0.5rem;
    font-weight: bold;
    text-align: center;
    font-size: 16px;
    border-radius: 7px;    
    background-color: #DCDCDC;    
    border-bottom: 0;
              border-right: 0;
    border-top: 0.5px;
              border-left: 0.5px;
              border: 0.5px solid grey;
         
   & option { margin: 6px !important;}  
  }

</style>

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.3.0/js/bootstrap-datepicker.js"></script>
</head>
<body class="w3-light-grey">

	<script>
		$(function() {
			$("#datepicker1").datepicker({
				autoclose : true,
				todayHighlight : true
			}).datepicker('update', new Date());
		});

		$(function() {
			$("#datepicker2").datepicker({
				autoclose : true,
				todayHighlight : true
			}).datepicker('update', new Date());
		});
		
		/*Dropdown Menu*/
		$('.dropdown').click(function () {
		        $(this).attr('tabindex', 1).focus();
		        $(this).toggleClass('active');
		        $(this).find('.dropdown-menu').slideToggle(300);
		    });
		    $('.dropdown').focusout(function () {
		        $(this).removeClass('active');
		        $(this).find('.dropdown-menu').slideUp(300);
		    });
		    $('.dropdown .dropdown-menu li').click(function () {
		        $(this).parents('.dropdown').find('span').text($(this).text());
		        $(this).parents('.dropdown').find('input').attr('value', $(this).attr('id'));
		    });
		/*End Dropdown Menu*/


		$('.dropdown-menu li').click(function () {
		  var input = '<strong>' + $(this).parents('.dropdown').find('input').val() + '</strong>',
		      msg = '<span class="msg">Hidden input value: ';
		  $('.msg').html(msg + input + '</span>');
		}); 
	</script>

	<!-- Top container -->
	<div class="w3-bar w3-top w3-black w3-large" style="z-index: 4">
		<button
			class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey"
			onclick="w3_open();">
			<i class="fa fa-bars"></i>  Menu
		</button>
		<span class="w3-bar-item w3-right">Logout</span>
	</div>

	<!-- Sidebar/menu -->
	<nav class="w3-sidebar w3-collapse w3-white w3-animate-left"
		style="z-index: 3; width: 300px;" id="mySidebar">
		<br>
		<div class="w3-container w3-row">
			<div class="w3-col s4">
				<img src="/w3images/avatar2.png" class="w3-circle w3-margin-right"
					style="width: 46px">
			</div>
			<div class="w3-col s8 w3-bar">
				<span>Welcome, <strong>${resList.name}</strong></span><br> <a
					href="#" class="w3-bar-item w3-button"><i
					class="fa fa-envelope"></i></a> <a href="#"
					class="w3-bar-item w3-button"><i class="fa fa-user"></i></a> <a
					href="#" class="w3-bar-item w3-button"><i class="fa fa-cog"></i></a>
			</div>
		</div>
		<hr>
		<div class="w3-container">
			<h5>Dashboard</h5>
		</div>
		<div class="w3-bar-block">
			<a href="#"
				class="w3-bar-item w3-button w3-padding-16 w3-hide-large w3-dark-grey w3-hover-black"
				onclick="w3_close()" title="close menu"><i
				class="fa fa-remove fa-fw"></i>  Close Menu</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-eye fa-fw"></i>  View Roaster</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-user fa-fw"></i>  Add Member</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-user fa-fw"></i>  Edit Member</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-users fa-fw"></i>  Add Team</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-users fa-fw"></i>  Edit Team</a> <a href="#"
				class="w3-bar-item w3-button w3-padding"><i
				class="fa fa-cog fa-fw"></i>  Settings</a><br> <br>
		</div>
	</nav>


	<!-- Overlay effect when opening sidebar on small screens -->
	<div class="w3-overlay w3-hide-large w3-animate-opacity"
		onclick="w3_close()" style="cursor: pointer" title="close side menu"
		id="myOverlay"></div>

	<!-- !PAGE CONTENT! -->
	<div class="w3-main" style="margin-left: 300px; margin-top: 43px;">

		<!-- Header -->
		<header class="w3-container" style="padding-top: 22px">
			<h5>
				<b><i class="fa fa-dashboard"></i> ROASTER </b>
			</h5>
		</header>
		
<!--  DATE -->		
	<div class="w3-cell-row">
		<div align="center" class="form-inline">
<b>From:</b>
			<div id="datepicker1" class="input-group date"
				data-date-format="dd-mm-yyyy">
			<input class="form-control" label="From" type="text" readonly /> 
				<span
					class="input-group-addon"><i
					class="glyphicon glyphicon-calendar"></i></span>
			</div> 
<b>To:</b>
			<div id="datepicker2" class="input-group date"
				data-date-format="dd-mm-yyyy">
			<input class="form-control" type="text" readonly /> <span
					class="input-group-addon"><i
					class="glyphicon glyphicon-calendar"></i></span>
			</div>
		</div>
</div>

<!-- DropDowns -->

  <div align="center" class="rad-date">
        <div class="dropdown">
        <label for="selectMonth">Key</label>
                     <select id="selectMonth" class="dropdown-select">
                     <option>Month</option>
      </select>
        </div>
        <div class="dropdown">
        <label for="selectMonth">Constant</label>
                     <select id="selectDay" class="dropdown-select">
                     <option>Day</option>
      </select>
        </div>
        <div class="dropdown">
        <label for="selectMonth">Members</label>
                     <select id="selectYear" class="dropdown-select">
                     <option>Year</option>
      </select>
        </div>
      </div>
                             
                   <div class="button">
                                 <button class="w3-button w3-dark-grey" style="margin-left:auto;margin-right:auto;display:block">
              Add  <i class="fa fa-plus"></i>
        </button>
                   </div>   




 <div class="w3-dropdown-content w3-bar-block w3-cell">
       <select name="resource">
        <jstlcore:forEach items="${memberList}" var="resource">
            <option value="${resource.name}" selected>${resource.name}</option>
        </jstlcore:forEach>
    </select>
 </div>
 
 <div class="container">
    <span class="choose">Member</span>
  
      <div class="dropdown">
        <div class="select">
          <i class="fa fa-chevron-left"></i>
        </div>
         <select name="resource" class="dropdown-menu">
        <jstlcore:forEach items="${memberList}" var="resource">
            <option value="${resource.name}" selected>${resource.name}</option>
        </jstlcore:forEach>
    </select>
      </div>
  
  <span class="msg"></span>
</div>


		<div class="w3-row-padding w3-margin-bottom">
			<div class="w3-quarter">
				<div class="w3-container w3-red w3-padding-16">
					<div class="w3-left">
						<i class="fa fa-comment w3-xxxlarge"></i>
					</div>
					<div class="w3-right">
						<h3>52</h3>
					</div>
					<div class="w3-clear"></div>
					<h4>Messages</h4>
				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-container w3-blue w3-padding-16">
					<div class="w3-left">
						<i class="fa fa-eye w3-xxxlarge"></i>
					</div>
					<div class="w3-right">
						<h3>99</h3>
					</div>
					<div class="w3-clear"></div>
					<h4>Views</h4>
				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-container w3-teal w3-padding-16">
					<div class="w3-left">
						<i class="fa fa-share-alt w3-xxxlarge"></i>
					</div>
					<div class="w3-right">
						<h3>23</h3>
					</div>
					<div class="w3-clear"></div>
					<h4>Shares</h4>
				</div>
			</div>
			<div class="w3-quarter">
				<div class="w3-container w3-orange w3-text-white w3-padding-16">
					<div class="w3-left">
						<i class="fa fa-users w3-xxxlarge"></i>
					</div>
					<div class="w3-right">
						<h3>50</h3>
					</div>
					<div class="w3-clear"></div>
					<h4>Users</h4>
				</div>
			</div>
		</div>

		<div class="w3-panel">
			<div class="w3-row-padding" style="margin: 0 -16px">
				<div class="w3-third">
					<h5>Regions</h5>
					<img src="/w3images/region.jpg" style="width: 100%"
						alt="Google Regional Map">
				</div>
				<div class="w3-twothird">
					<h5>Feeds</h5>
					<table class="w3-table w3-striped w3-white">
						<tr>
							<td><i class="fa fa-user w3-text-blue w3-large"></i></td>
							<td>New record, over 90 views.</td>
							<td><i>10 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-bell w3-text-red w3-large"></i></td>
							<td>Database error.</td>
							<td><i>15 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-users w3-text-yellow w3-large"></i></td>
							<td>New record, over 40 users.</td>
							<td><i>17 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-comment w3-text-red w3-large"></i></td>
							<td>New comments.</td>
							<td><i>25 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-bookmark w3-text-blue w3-large"></i></td>
							<td>Check transactions.</td>
							<td><i>28 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-laptop w3-text-red w3-large"></i></td>
							<td>CPU overload.</td>
							<td><i>35 mins</i></td>
						</tr>
						<tr>
							<td><i class="fa fa-share-alt w3-text-green w3-large"></i></td>
							<td>New shares.</td>
							<td><i>39 mins</i></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
		<hr>
		<div class="w3-container">
			<h5>General Stats</h5>
			<p>New Visitors</p>
			<div class="w3-grey">
				<div class="w3-container w3-center w3-padding w3-green"
					style="width: 25%">+25%</div>
			</div>

			<p>New Users</p>
			<div class="w3-grey">
				<div class="w3-container w3-center w3-padding w3-orange"
					style="width: 50%">50%</div>
			</div>

			<p>Bounce Rate</p>
			<div class="w3-grey">
				<div class="w3-container w3-center w3-padding w3-red"
					style="width: 75%">75%</div>
			</div>
		</div>
		<hr>

		<div class="w3-container">
			<h5>Countries</h5>
			<table
				class="w3-table w3-striped w3-bordered w3-border w3-hoverable w3-white">
				<tr>
					<td>United States</td>
					<td>65%</td>
				</tr>
				<tr>
					<td>UK</td>
					<td>15.7%</td>
				</tr>
				<tr>
					<td>Russia</td>
					<td>5.6%</td>
				</tr>
				<tr>
					<td>Spain</td>
					<td>2.1%</td>
				</tr>
				<tr>
					<td>India</td>
					<td>1.9%</td>
				</tr>
				<tr>
					<td>France</td>
					<td>1.5%</td>
				</tr>
			</table>
			<br>
			<button class="w3-button w3-dark-grey">
				More Countries  <i class="fa fa-arrow-right"></i>
			</button>
		</div>
		<hr>
		<div class="w3-container">
			<h5>Recent Users</h5>
			<ul class="w3-ul w3-card-4 w3-white">
				<li class="w3-padding-16"><img src="/w3images/avatar2.png"
					class="w3-left w3-circle w3-margin-right" style="width: 35px">
					<span class="w3-xlarge">Mike</span><br></li>
				<li class="w3-padding-16"><img src="/w3images/avatar5.png"
					class="w3-left w3-circle w3-margin-right" style="width: 35px">
					<span class="w3-xlarge">Jill</span><br></li>
				<li class="w3-padding-16"><img src="/w3images/avatar6.png"
					class="w3-left w3-circle w3-margin-right" style="width: 35px">
					<span class="w3-xlarge">Jane</span><br></li>
			</ul>
		</div>
		<hr>

		<div class="w3-container">
			<h5>Recent Comments</h5>
			<div class="w3-row">
				<div class="w3-col m2 text-center">
					<img class="w3-circle" src="/w3images/avatar3.png"
						style="width: 96px; height: 96px">
				</div>
				<div class="w3-col m10 w3-container">
					<h4>
						John <span class="w3-opacity w3-medium">Sep 29, 2014, 9:12
							PM</span>
					</h4>
					<p>Keep up the GREAT work! I am cheering for you!! Lorem ipsum
						dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
						incididunt ut labore et dolore magna aliqua.</p>
					<br>
				</div>
			</div>

			<div class="w3-row">
				<div class="w3-col m2 text-center">
					<img class="w3-circle" src="/w3images/avatar1.png"
						style="width: 96px; height: 96px">
				</div>
				<div class="w3-col m10 w3-container">
					<h4>
						Bo <span class="w3-opacity w3-medium">Sep 28, 2014, 10:15
							PM</span>
					</h4>
					<p>Sed do eiusmod tempor incididunt ut labore et dolore magna
						aliqua.</p>
					<br>
				</div>
			</div>
		</div>
		<br>
		<div class="w3-container w3-dark-grey w3-padding-32">
			<div class="w3-row">
				<div class="w3-container w3-third">
					<h5 class="w3-bottombar w3-border-green">Demographic</h5>
					<p>Language</p>
					<p>Country</p>
					<p>City</p>
				</div>
				<div class="w3-container w3-third">
					<h5 class="w3-bottombar w3-border-red">System</h5>
					<p>Browser</p>
					<p>OS</p>
					<p>More</p>
				</div>
				<div class="w3-container w3-third">
					<h5 class="w3-bottombar w3-border-orange">Target</h5>
					<p>Users</p>
					<p>Active</p>
					<p>Geo</p>
					<p>Interests</p>
				</div>
			</div>
		</div>

		<!-- Footer -->
		<footer class="w3-container w3-padding-16 w3-light-grey">
			<h4>FOOTER</h4>
			<p>
				Powered by <a href="https://www.w3schools.com/w3css/default.asp"
					target="_blank">w3.css</a>
			</p>
		</footer>

		<!-- End page content -->
	</div>

	<script>
		// Get the Sidebar
		var mySidebar = document.getElementById("mySidebar");

		// Get the DIV with overlay effect
		var overlayBg = document.getElementById("myOverlay");

		// Toggle between showing and hiding the sidebar, and add overlay effect
		function w3_open() {
			if (mySidebar.style.display === 'block') {
				mySidebar.style.display = 'none';
				overlayBg.style.display = "none";
			} else {
				mySidebar.style.display = 'block';
				overlayBg.style.display = "block";
			}
		}

		// Close the sidebar with the close button
		function w3_close() {
			mySidebar.style.display = "none";
			overlayBg.style.display = "none";
		}
	</script>

</body>
</html>
