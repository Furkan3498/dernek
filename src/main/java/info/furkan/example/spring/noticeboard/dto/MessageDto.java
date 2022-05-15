package info.furkan.example.spring.noticeboard.dto;

import java.time.LocalDateTime;

public class MessageDto {

	private Long id;
	private LocalDateTime publishDate;
	private LocalDateTime removeDate;
	private String owner;
	private String description;
	private String approvedBy;
	private LocalDateTime approvedDate;
	private Integer status;

	public static final Integer WAITING_APPROVE = 1;
	public static final Integer APPROVED = 2;
	public static final Integer PUBLISHED = 3;
	public static final Integer EXPIRED = 4;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDateTime publishDate) {
		this.publishDate = publishDate;
	}

	public LocalDateTime getRemoveDate() {
		return removeDate;
	}

	public void setRemoveDate(LocalDateTime removeDate) {
		this.removeDate = removeDate;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApprovedBy() {
		return approvedBy;
	}

	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}

	public LocalDateTime getApprovedDate() {
		return approvedDate;
	}

	public void setApprovedDate(LocalDateTime approvedDate) {
		this.approvedDate = approvedDate;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
