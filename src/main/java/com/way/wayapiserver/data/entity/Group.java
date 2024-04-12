package com.way.wayapiserver.data.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // DB의 테이블과 1:1 매핑되는 객체
@Table(name = "groups")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Group {
    @JsonIgnore
    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "isPremium")
    private Boolean isPremium;

    @ManyToMany
    @JoinTable(name = "user_group", joinColumns = {
            @JoinColumn(name = "group_id", referencedColumnName = "group_id") }, inverseJoinColumns = {
                    @JoinColumn(name = "user_id", referencedColumnName = "user_id") })
    private Set<User> users;
}
