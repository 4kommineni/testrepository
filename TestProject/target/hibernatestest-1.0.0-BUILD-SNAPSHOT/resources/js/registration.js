$('#reg').submit(function() {
	$('#repswdErr').html('');
	if ($('#password').val() === $('#confirm_password').val()) {
		return true;
	} else {
		$('#repswdErr').html('Password mismatch');
		return false;
	}
});