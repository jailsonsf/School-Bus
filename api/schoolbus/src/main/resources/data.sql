insert into educational_institution(id, name, cnpj) values(4, 'escola tu que sabe', '1234567')

insert into Person(id, user_type, age, cpf, name, rg, course, institution_id) values(1, 'student', 20, '111', 'jailson', '123', 'computação', 4)
insert into Person(id, user_type, age, cpf, name, rg) values (2, 'attendant', 28, '123', 'zequinha', '1234')
insert into Person(id, user_type, age, cpf, name, rg, cnh) values(3, 'driver', 39, '1234', 'joaozinho', '12345', '123456')

insert into address(id, name, district, number, institution_id) values(1, 'rua z', 'centro', 27, 4)

insert into address(id, name, district, number, student_id) values(2, 'rua x', 'centro', 47, 1)
insert into address(id, name, district, number, attendant_id) values(3, 'rua y', 'centro', 54, 2)
insert into address(id, name, district, number, driver_id) values(4, 'rua z', 'centro', 36, 3)

