// Call the dataTables jQuery plugin
$(document).ready(function() {



  $('#dataTable').DataTable();
});

async function CargarUsuarios(){
    const RequestJson = await fetch('/Empleados/1', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const EmpleadosJson = await RequestJson.json();

    console.log(EmpleadosJson);
}