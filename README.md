# demo-spring-audit (tiếp cận 3)
## Use java 11 (amazon) + spring boot version 2.7.7
## Example simple spring (audit + security + jpa + ddd)
* audit use spring data jpa
* security use spring boot security
* jpa use hibernate jpa (spring data jpa)
* ddd = domain drive design

### One Entity:
* book
### API (/v1/spring/book):
* Get -> get all books in db
* Post -> create new book in db
* Put -> update book in db
### Security  in class distributed/configs/SecurityConfig.java


