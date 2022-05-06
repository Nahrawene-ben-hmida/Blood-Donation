package com.example.BloodDonation.models;


import javax.persistence.*;

// Please add the Lombok annotation to be more flexible : https://www.baeldung.com/intro-to-project-lombok 
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Blog 
{
    @Id
    @SequenceGenerator(name = "blog_sequence",
    sequenceName = "blog_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.AUTO,
            generator = "blog_sequence"
    )
    private Long id;
    private String titre;
    private String description;
    private String imageURL;

    public Blog(String titre
            , String description,
                String imageURL) {
        this.titre = titre;
        this.description = description;
        this.imageURL = imageURL;
    }
}

