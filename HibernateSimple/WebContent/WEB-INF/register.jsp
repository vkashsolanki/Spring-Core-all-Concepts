<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<style>
body {
	font-family: Verdana, Geneva, sans-serif;
	font-size: 14px;
	background: #006400;
}
.clearfix {
	&:after {
		content: "";
		display: block;
		clear: both;
		visibility: hidden;
		height: 0;
	}
}
.form_wrapper {
	background: #fff;
	width: 600px;
	max-width: 100%;
	box-sizing: border-box;
	padding: 25px;
	margin: 8% auto 0;
	position: relative;
	z-index: 1;
	border-top: 5px solid $yellow;
	-webkit-box-shadow: 0 0 3px rgba(0, 0, 0, 0.1);
	-moz-box-shadow: 0 0 3px rgba(0, 0, 0, 0.1);
	box-shadow: 0 0 3px rgba(0, 0, 0, 0.1);
	-webkit-transform-origin: 50% 0%;
	transform-origin: 50% 0%;
	-webkit-transform: scale3d(1, 1, 1);
	transform: scale3d(1, 1, 1);
	-webkit-transition: none;
	transition: none;
	-webkit-animation: expand 0.8s 0.6s ease-out forwards;
	animation: expand 0.8s 0.6s ease-out forwards;
	opacity: 0;
	h2 {
		font-size: 1.5em;
		line-height: 1.5em;
		margin: 0;
	}
	.title_container {
		text-align: center;
		padding-bottom: 15px;
	}
	h3 {
		font-size: 1.1em;
		font-weight: normal;
		line-height: 1.5em;
		margin: 0;
	}
	label {
		font-size: 12px;
	}
	.row {
		margin: 10px -15px;
		>div {
			padding: 0 15px;
			box-sizing: border-box;
		}
	}
	.col_half {
		width: 50%;
		float: left;
	}
	.input_field {
		position: relative;
		margin-bottom: 20px;
		-webkit-animation: bounce 0.6s ease-out;
		animation: bounce 0.6s ease-out;
		>span {
			position: absolute;
			left: 0;
			top: 0;
			color: #333;
			height: 100%;
			border-right: 1px solid $grey;
			text-align: center;
			width: 30px;
			>i {
				padding-top: 10px;
			}
		}
	}
	.textarea_field {
		>span {
			>i {
				padding-top: 10px;
			}
		}
	}
	input {
	&[type="text"], &[type="email"], &[type="password"] {
	width: 100%;
	padding: 8px 10px 9px 35px;
	height: 35px;
	border: 1px solid $grey;
	box-sizing: border-box;
	outline: none;
	-webkit-transition: all 0.30s ease-in-out;
	-moz-transition: all 0.30s ease-in-out;
	-ms-transition: all 0.30s ease-in-out;
	transition: all 0.30s ease-in-out;
	}
	&[type="text"]:hover, &[type="email"]:hover, &[type="password"]:hover {
	background: #fafafa;
	}
	&[type="text"]:focus, &[type="email"]:focus, &[type="password"]:focus {
	-webkit-box-shadow: 0 0 2px 1px rgba(255, 169, 0, 0.5);
	-moz-box-shadow: 0 0 2px 1px rgba(255, 169, 0, 0.5);
	box-shadow: 0 0 2px 1px rgba(255, 169, 0, 0.5);
	border: 1px solid $yellow;
	background: #fafafa;
	}
	&[type="submit"] {
		background: $yellow;
		height: 35px;
		line-height: 35px;
		width: 100%;
		border: none;
		outline: none;
		cursor: pointer;
		color: #fff;
		font-size: 1.1em;
		margin-bottom: 10px;
		-webkit-transition: all 0.30s ease-in-out;
		-moz-transition: all 0.30s ease-in-out;
		-ms-transition: all 0.30s ease-in-out;
		transition: all 0.30s ease-in-out;
		&:hover {
			background: darken($yellow,7%);
		}
		&:focus {
			background: darken($yellow,7%);
		}
	} 
	&[type="checkbox"], &[type="radio"] {
	border: 0;
	clip: rect(0 0 0 0);
	height: 1px;
	margin: -1px;
	overflow: hidden;
	padding: 0;
	position: absolute;
	width: 1px;
	}
}
}
.form_container {
	.row {
		.col_half.last {
			border-left: 1px solid $grey;
		}
	}
}

@-webkit-keyframes check {
0% { height: 0; width: 0; }
25% { height: 0; width: 7px; }
50% { height: 20px; width: 7px; }
}

@keyframes check {
0% { height: 0; width: 0; }
25% { height: 0; width: 7px; }
50% { height: 20px; width: 7px; }
}

@-webkit-keyframes expand { 
	0% { -webkit-transform: scale3d(1,0,1); opacity:0; }
	25% { -webkit-transform: scale3d(1,1.2,1); }
	50% { -webkit-transform: scale3d(1,0.85,1); }
	75% { -webkit-transform: scale3d(1,1.05,1); }
	100% { -webkit-transform: scale3d(1,1,1); opacity:1; }
}

@keyframes expand { 
	0% { -webkit-transform: scale3d(1,0,1); transform: scale3d(1,0,1); opacity:0; }
	25% { -webkit-transform: scale3d(1,1.2,1); transform: scale3d(1,1.2,1); }
	50% { -webkit-transform: scale3d(1,0.85,1); transform: scale3d(1,0.85,1); }
	75% { -webkit-transform: scale3d(1,1.05,1); transform: scale3d(1,1.05,1); }
	100% { -webkit-transform: scale3d(1,1,1); transform: scale3d(1,1,1); opacity:1; }
}


@-webkit-keyframes bounce { 
	0% { -webkit-transform: translate3d(0,-25px,0); opacity:0; }
	25% { -webkit-transform: translate3d(0,10px,0); }
	50% { -webkit-transform: translate3d(0,-6px,0); }
	75% { -webkit-transform: translate3d(0,2px,0); }
	100% { -webkit-transform: translate3d(0,0,0); opacity: 1; }
}

@keyframes bounce { 
	0% { -webkit-transform: translate3d(0,-25px,0); transform: translate3d(0,-25px,0); opacity:0; }
	25% { -webkit-transform: translate3d(0,10px,0); transform: translate3d(0,10px,0); }
	50% { -webkit-transform: translate3d(0,-6px,0); transform: translate3d(0,-6px,0); }
	75% { -webkit-transform: translate3d(0,2px,0); transform: translate3d(0,2px,0); }
	100% { -webkit-transform: translate3d(0,0,0); transform: translate3d(0,0,0); opacity: 1; }
}
@media (max-width: 600px) {
	.form_wrapper {
		.col_half {
			width: 100%;
			float: none;
		}
	}
	.bottom_row {
		.col_half {
			width: 50%;
			float: left;
		}
	}

}
</style>
<body>
<div class="form_wrapper">
<div class="form_container">
	<div class="title_container">
	<h1>GeekUser Registration Form</h1>
	<form action="register" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="name" size="50" /></td>
			</tr>
		
			<tr>
				<td>email :</td>
				<td><input type="text" name="email" size="50" /></td>
			</tr>
				<tr>
				<td>Password :</td>
				<td><input type="password" name="password" size="50" /></td>
			</tr>

		</table>
		<p />
		<input type="submit" value="register" />
	</form>
	</div>
	</div>
	</div>
</body>
</html>
