package com.example.jpatest.entitymanager.relation;

import com.example.jpatest.entitymanager.entity.PublicInfoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

//단방향으로 작업
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="myemp")
public class EmpEntity extends PublicInfoEntity {
    @Id
    private String userId;
    private String name;
    private String addr;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="userPrivateId")
    private PrivateInfoEntity infoEntity;

    //경력사항은 한 사람이 여러 개 가질 수 있다
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "userKey")
    private List<HistoryEntity> historylist = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "deptId")
    private DeptEntity dept;
    public EmpEntity(String userId, String name, String addr, PrivateInfoEntity infoEntity) {
        this.userId = userId;
        this.name = name;
        this.addr = addr;
        this.infoEntity = infoEntity;
    }

    public EmpEntity(String userId, String name, String addr, PrivateInfoEntity infoEntity, List<HistoryEntity> historylist) {
        this.userId = userId;
        this.name = name;
        this.addr = addr;
        this.infoEntity = infoEntity;
        this.historylist = historylist;
    }
}
