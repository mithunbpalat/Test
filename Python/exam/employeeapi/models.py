from django.db import models

# Create your models here.

class Employee(models.Model):
    fullname = models.CharField(max_length=100)
    emp_code = models.CharField(max_length=5)
    mobile   = models.CharField(max_length=20)

    # Create / Insert / Add  -  POST
    # Retrieve / Fetch       -  GET
    # Update / Edit          -  PUT
    # Delete / Remove        -  DELETE