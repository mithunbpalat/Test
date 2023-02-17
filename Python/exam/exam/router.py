from employeeapi.viewsets import EmployeeViewset
from rest_framework import routers

router = routers.SimpleRouter()
router.register('employee',EmployeeViewset)


#  localhost:p/api/employee/5
#  GET, POST, PUT , DELETE
#  List, Retrieve