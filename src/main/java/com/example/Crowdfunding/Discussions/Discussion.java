package com.example.Crowdfunding.Discussions;

import com.example.Crowdfunding.Admins.Admin;
import com.example.Crowdfunding.Members.Member;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "discussions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Discussion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SEQUENCE_DISCUSSION")
    @SequenceGenerator(name = "SEQUENCE_DISCUSSION", sequenceName = "discussions_discussion_id_seq", allocationSize = 1)
    private Long discussion_id;
    private String MessageText;
    private Date MessageDate;

    @ManyToOne
    @JoinColumn(name = "admin_id")
    private Admin admin;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    // Define relationships here if needed
}
