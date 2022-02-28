package com.study.spring_data_study.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2022/2/28
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Getter
@Setter
@MappedSuperclass
public class BaseEntity {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name = "created_time")
	@Temporal(value = TemporalType.TIME)
	private Date createdTime;

	@Column(name = "updated_time")
	@Temporal(value = TemporalType.TIME)
	private Date updatedTime;

	@PrePersist
	public void prePersist() {
		final Date date = new Date();
		if (this.createdTime == null) {
			this.createdTime = date;
		}
		if (this.updatedTime == null) {
			this.updatedTime = date;
		}
	}

	@PreUpdate
	public void preUpdate() {
		this.updatedTime = new Date();
	}

	@PreRemove
	public void preRemove() {
		this.updatedTime = new Date();
	}

}
