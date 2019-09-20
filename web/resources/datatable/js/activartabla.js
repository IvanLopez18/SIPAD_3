$(document).ready(function() {

	var table = $('#myTable').DataTable();

	$('#example').DataTable( {
        dom: 'Bfrtip',
        buttons: [
            'print'
        ]
    } );
} );


$(document).ready(function() {
	$('#torneos').DataTable();
	var table = $('#myTable').DataTable();
} );

$(document).ready(function() {
	$('#asistencia').DataTable();
	var table = $('#myTable').DataTable();
} );


