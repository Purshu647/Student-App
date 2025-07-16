<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Student Management</title>
  <link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
    rel="stylesheet">
</head>
<body>



  <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container-fluid">
      <a class="navbar-brand navbar-primary" href="#">Welcome </a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav ms-auto">
          <li class="nav-item">
            <a class="nav-link" href="#">Reset Password</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Update Data</a>
          </li>
          <li class="nav-item">
          <form action="logout" method="post">
           <input class="btn btn-danger" type="button" name="logout" value="Logout">
            </form>
          </li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="container mt-4">
    <h1 class="text-center mb-4">Dashboard</h1>
</div>
<!-- User Section -->
    <div class="row">
      <div class="col-md-12">
        <h3>View Your Data</h3>
        <table class="table table-hover">
          <thead>
            <tr>
              <th>Id</th>
              <th>Name</th>
              <th>Phone</th>
              <th>Mail ID</th>
              <th>Branch</th>
	      	  <th>Location</th>
            </tr>
          </thead>
          <tbody>
          
         </tbody>
        </table>
        
      </div>
    </div>
</body>
</html>