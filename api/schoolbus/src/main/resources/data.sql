-- Institutions
insert into educational_institution(id, name, cnpj) values(1, 'UFAL', '1451923812')
insert into educational_institution(id, name, cnpj) values(2, 'IFAL', '5484513217')
insert into educational_institution(id, name, cnpj) values(3, 'UNEAL', '8495746488')

-- Students
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(1, 'student', 18, '64386868862', 'Davi', '21877', 'Computação', 1)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(2, 'student', 20, '25754376210', 'Miguel', '58339', 'Computação', 3)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(3, 'student', 22, '37755910510', 'Sophia', '42415', 'Computação', 1)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(4, 'student', 19, '10875105810', 'Alice', '84134', 'Biologia', 1)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(5, 'student', 23, '71071077429', 'Julia', '3853', 'Matemática', 2)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(6, 'student', 17, '55432826296', 'Manuela', '47463', 'Biologia', 3)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(7, 'student', 20, '19397542584', 'Bernardo', '13254', 'Biologia', 3)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(8, 'student', 20, '68103378434', 'Matheus', '19622', 'Computação', 2)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(9, 'student', 18, '43101107179', 'Helena', '75773', 'Matemática', 2)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(10, 'student', 18, '68643109104', 'Beatriz', '88109', 'Computação', 3)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(11, 'student', 22, '83775495626', 'Guilherme', '37847', 'Matemática', 1)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(12, 'student', 20, '11097845891', 'Samuel', '31019', 'Biologia', 1)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(13, 'student', 21, '46783103151', 'Vitor', '18796', 'Biologia', 2)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(14, 'student', 23, '54107655945', 'Lívia', '77582', 'Matemática', 2)
insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(15, 'student', 18, '53643345646', 'Maria Clara', '14105', 'Matemática', 3)

-- Attendants
insert into Person(id, user_type, age, cpf, name, rg) values (16, 'attendant', 28, '14895234877', 'Julia', '78514')
insert into Person(id, user_type, age, cpf, name, rg) values (17, 'attendant', 26, '64848517802', 'Isabella', '36598')

-- Drivers
insert into Person(id, user_type, age, cpf, name, rg, cnh) values(18, 'driver', 39, '11047589328', 'Pedro', '89742', '9875613')
insert into Person(id, user_type, age, cpf, name, rg, cnh) values(19, 'driver', 42, '20498523547', 'Arthur', '35287', '1871625')
insert into Person(id, user_type, age, cpf, name, rg, cnh) values(20, 'driver', 37, '78514895214', 'Luiza', '98412', '3594417')

-- Addresses of Institutions
insert into address(id, name, district, number, institution_id) values(1, 'Rua z', 'centro', 33, 1)
insert into address(id, name, district, number, institution_id) values(2, 'Rua x', 'centro', 30, 2)
insert into address(id, name, district, number, institution_id) values(3, 'Rua y', 'centro', 40, 3)

-- Addresses of Persons
insert into address(id, name, district, number, person_id) values(4, 'Rua x', 'centro', 39, 1)
insert into address(id, name, district, number, person_id) values(5, 'Rua y', 'centro', 5, 2)
insert into address(id, name, district, number, person_id) values(6, 'Rua z', 'centro', 36, 3)
insert into address(id, name, district, number, person_id) values(7, 'Rua z', 'centro', 4, 4)
insert into address(id, name, district, number, person_id) values(8, 'Rua z', 'centro', 7, 5)
insert into address(id, name, district, number, person_id) values(9, 'Rua x', 'centro', 17, 6)
insert into address(id, name, district, number, person_id) values(10, 'Rua x', 'centro', 14, 7)
insert into address(id, name, district, number, person_id) values(11, 'Rua y', 'centro', 38, 8)
insert into address(id, name, district, number, person_id) values(12, 'Rua y', 'centro', 9, 9)
insert into address(id, name, district, number, person_id) values(13, 'Rua y', 'centro', 29, 10)
insert into address(id, name, district, number, person_id) values(14, 'Rua y', 'centro', 34, 11)
insert into address(id, name, district, number, person_id) values(15, 'Rua z', 'centro', 13, 12)
insert into address(id, name, district, number, person_id) values(16, 'Rua x', 'centro', 12, 13)
insert into address(id, name, district, number, person_id) values(17, 'Rua y', 'centro', 22, 14)
insert into address(id, name, district, number, person_id) values(18, 'Rua x', 'centro', 27, 15)
insert into address(id, name, district, number, person_id) values(19, 'Rua x', 'centro', 37, 16)
insert into address(id, name, district, number, person_id) values(20, 'Rua z', 'centro', 24, 17)
insert into address(id, name, district, number, person_id) values(21, 'Rua y', 'centro', 18, 18)
insert into address(id, name, district, number, person_id) values(22, 'Rua x', 'centro', 10, 19)
insert into address(id, name, district, number, person_id) values(23, 'Rua y', 'centro', 15, 20)
insert into address(id, name, district, number, person_id) values(24, 'Rua z', 'centro', 16, 20)
