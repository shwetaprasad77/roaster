<html>
<head>
<title>Calendar</title>
<!--script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script-->
<!--script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script-->
<script
	src='http://fullcalendar.io/js/fullcalendar-2.7.1/lib/moment.min.js'></script>
<script
	src='http://fullcalendar.io/js/fullcalendar-2.7.1/lib/jquery.min.js'></script>
<!-- script src="http://fullcalendar.io/js/fullcalendar-2.7.1/lib/jqueryjquery-ui.custom.min.js"></script-->
<script
	src='http://fullcalendar.io/js/fullcalendar-2.7.1/fullcalendar.min.js'></script>
<link rel='stylesheet' type='text/css'
	href='https://cdnjs.cloudflare.com/ajax/libs/fullcalendar/2.7.1/fullcalendar.min.css'>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/calendar.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resources/js/calendar.js"></script>
</head>

<body>

	<div class="site-header autocomplete">
		<div class="input-wrapper">
			<input type="text" placeholder="Search" class="search-field">
			<span class="close">Cancel</span>

			<div class="focus-background"></div>
		</div>
		<div class="dialog"></div>

	</div>

	<div class="my-action">

		<table class="my-action-table">
			<th bgcolor="#ffcc00">My Action</th>
			<tr bgcolor="ffff99">
				<td><button>
						<button>Assigned Task</button></td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Leaves & Trainings</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>My Notes</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Shift Transition Notes</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Daily Standup MOM</td>
				</button>
			</tr>
		</table>
	</div>

	<div class="supervisor-action">

		<table class="supervisor-action-table">
			<th bgcolor="#ffcc00">Supervisor Action</th>
			<tr bgcolor="ffff99">
				<td><button>Make/Submit Change</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Auto Prepare</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Find Conflicts</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Publish to Team</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Generate Report</td>
				</button>
			</tr>
		</table>
	</div>

	<div class="admin-action">

		<table class="admin-action-table">
			<th bgcolor="#ffcc00">Admin Action</th>
			<tr bgcolor="ffff99">
				<td><button>Create New User</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Create New Team</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Reset User</td>
				</button>
			</tr>
			<tr bgcolor="ffff99">
				<td><button>Grant/Revoke Privilege</td>
				</button>
			</tr>
		</table>
	</div>


	<div id='calendar'></div>

	<div id="calendar-popup">

		<form id="event-form">
			<div class='calander_popip_title'>
				<i class="fa fa-calendar" aria-hidden="true"></i> Add Event
			</div>
			<ul>
				<li><label for="event-start"><i class="fa fa-bell-o"
						aria-hidden="true"></i> From</label> <input id="event-start"
					class='form-control' type="datetime-local" name="start" /></li>
				<li><label for="event-end"><i class="fa fa-bell-slash"
						aria-hidden="true"></i> To</label> <input id="event-end"
					class='form-control' type="datetime-local" name="end" /></li>
				<li><label for="event-title"><i
						class="fa fa-calendar-minus-o" aria-hidden="true"></i> Member</label> <input
					id="event-title" class='form-control' type="text" name="title" /></li>
				<li><label for="event-location"><i
						class="fa fa-map-marker" aria-hidden="true"></i> Task</label> <input
					id="event-location" class='form-control' type="text"
					name="location" /></li>
				<li><label for="event-details"><i
						class="fa fa-info-circle" aria-hidden="true"></i> Type</label> <textarea
						id="event-details" class='form-control' name="details"></textarea>
				</li>
				<div class="button">
					<input type="submit" class='form-control submit_btn' />
				</div>
			</ul>
		</form>

		<div id="event">
			<header></header>
			<ul>
				<li class="start-time">
					<p>Start at</p> <time></time>
				</li>
				<li class="end-time">
					<p>End</p> <time></time>
				</li>
				<li>
					<p>
						<i class="fa fa-map-marker" aria-hidden="true"></i>Location
					</p>
					<p class="location"></p>
				</li>
				<li>
					<p>
						<i class="fa fa-info" aria-hidden="true"></i> Details:
					</p>
					<p class="details"></p>
				</li>
			</ul>

		</div>

		<div class="prong">
			<div class="bottom-prong-dk"></div>
			<div class="bottom-prong-lt"></div>
		</div>
	</div>


	<div class='modle' id='simplemodal'>
		<div class='modle-continer'>
			<form id="edit-form">

				<div class='modal-header'>
					<span class='close-btn' id='close-btnid'>&times</span>
					<h2>Edit Event</h2>
				</div>
				<div class='modal-body'>

					<lable for='eventname'>Member</lable>
					<input type='text' name='eventname' id='eventname'
						class='form-control'>
					<lable for='location'>Task</lable>
					<input type='text' name='location' id='location'
						class='form-control'> <label for="event-start">From</label><input
						id="eventstart" type="datetime-local" name="start"
						class='form-control' /> <label for="event-end">To</label> <input
						id="eventend" type="datetime-local" name="end"
						class='form-control' /> <label for="event-details">Details</label>
					<textarea id="eventdetails" type='text' name="details"
						class='form-control'></textarea>

				</div>
				<div class='modal-footer'>
					<button type='submit' class='btn btn-info'>save</button>
					<button class='btn btn-dafault'>cancel</button>

				</div>
			</form>
		</div>

	</div>

	<div id='search_result'>result</div>
	<!-- button class='btn btn-primary'>Add Events</button -->

</body>
</html>
<!-- button class='btn btn-primary'>Add Events</button -->

</body>
</html>