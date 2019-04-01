//package pp.ov.start.model;
//
//import lombok.*;
//import lombok.experimental.FieldDefaults;
//
//import javax.persistence.*;
//import java.util.List;
//
//@Entity
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString(exclude = "clients")
//@NoArgsConstructor
//@FieldDefaults(level = AccessLevel.PRIVATE)
//public class Department {
//    @Id
//    @GeneratedValue
//    int id;
//    String departmentCity;
//    int countOfWorkers;
//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "clientDepartment")
//    List<Client> clients;
//
//}
