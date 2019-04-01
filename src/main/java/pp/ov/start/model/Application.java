//package pp.ov.start.model;
//
//import lombok.*;
//
//import javax.persistence.*;
//
//@Entity
//@EqualsAndHashCode
//@Getter
//@Setter
//@NoArgsConstructor
//@ToString(exclude = "client")
//public class Application {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private int sum;
//    private String creditState;
//    private String currency;
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Client client;
//
//}
