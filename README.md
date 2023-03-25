# Relations
Jpa Rerlations in Tables :
                          OneToOne   == User , CNic
                          OneToMany  == Address , CNicNumber
                          ManyToOne  == Employes , Company
                          ManyToMany == Clas, Teacher 

DTO's                   : UserCNicDto, EmployeeCompanyDto, CNicNumberAddressDto, ClasTeacherDto

DAO                     : UserRepository, CompanyRepository, CNicNumberRepository, ClasReposotory

CONTROLLERS             : UserController, CompanyController, CNicControllerAddress, ClasTeacherController

SERVICES       
Interfaces              : UserService, CompanyService, CNicNumberService, ClasService
Implementation          : UserServiceImpl, Company ServiceImpl, CNicNumberImpl, ClasServiceImpl              

JpaApplication          : use bean of ModelMapper Dependency
