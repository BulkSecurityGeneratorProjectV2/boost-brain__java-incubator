package boost.brain.course.auth.repository.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class SessionEntity {
    private String id;
    private long startTime;
    private long validTime;
    private boolean active;

    @ManyToOne
    private CredentialsEntity credentialsEntity;
}
