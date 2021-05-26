package dicmeta.app.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter @Setter
public abstract class CommonTbl {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="regist_dt",insertable=false, updatable=false, columnDefinition="timestamp DEFAULT CURRENT_TIMESTAMP")
	//@Schema(description ="등록 일시" )
	protected Date registDt;

	@Column(name="regist_id", length=50)
	//@Schema(description ="등록 아이디" )
	protected String registId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="modify_dt")
	//@Schema(description ="수정 일시" )
	protected Date modifyDt;

	@Column(name="modify_id", length=50)
	//@Schema(description ="수정 아이디" )
	protected String modifyId;

	public Date getRegistDt() {
		return registDt;
	}

	public void setRegistDt(Date registDt) {
		this.registDt = registDt;
	}

	public String getRegistId() {
		return registId;
	}

	public void setRegistId(String registId) {
		this.registId = registId;
	}

	public Date getModifyDt() {
		return modifyDt;
	}

	public void setModifyDt(Date modifyDt) {
		this.modifyDt = modifyDt;
	}

	public String getModifyId() {
		return modifyId;
	}

	public void setModifyId(String modifyId) {
		this.modifyId = modifyId;
	}


}
