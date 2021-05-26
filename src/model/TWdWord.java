package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_wd_word database table.
 * 
 */
@Entity
@Table(name="t_wd_word")
@NamedQuery(name="TWdWord.findAll", query="SELECT t FROM TWdWord t")
public class TWdWord implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_WD_WORD_WORDSN_GENERATOR", sequenceName="T_WD_WORD_WORD_SN_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_WD_WORD_WORDSN_GENERATOR")
	@Column(name="word_sn")
	private Integer wordSn;

	@Column(name="prhibt_word")
	private String prhibtWord;

	private String synonm;

	@Column(name="thema_se")
	private String themaSe;

	@Column(name="word_dc")
	private String wordDc;

	@Column(name="word_en_abbr")
	private String wordEnAbbr;

	@Column(name="word_en_nm")
	private String wordEnNm;

	@Column(name="word_nm")
	private String wordNm;

	public TWdWord() {
	}

	public Integer getWordSn() {
		return this.wordSn;
	}

	public void setWordSn(Integer wordSn) {
		this.wordSn = wordSn;
	}

	public String getPrhibtWord() {
		return this.prhibtWord;
	}

	public void setPrhibtWord(String prhibtWord) {
		this.prhibtWord = prhibtWord;
	}

	public String getSynonm() {
		return this.synonm;
	}

	public void setSynonm(String synonm) {
		this.synonm = synonm;
	}

	public String getThemaSe() {
		return this.themaSe;
	}

	public void setThemaSe(String themaSe) {
		this.themaSe = themaSe;
	}

	public String getWordDc() {
		return this.wordDc;
	}

	public void setWordDc(String wordDc) {
		this.wordDc = wordDc;
	}

	public String getWordEnAbbr() {
		return this.wordEnAbbr;
	}

	public void setWordEnAbbr(String wordEnAbbr) {
		this.wordEnAbbr = wordEnAbbr;
	}

	public String getWordEnNm() {
		return this.wordEnNm;
	}

	public void setWordEnNm(String wordEnNm) {
		this.wordEnNm = wordEnNm;
	}

	public String getWordNm() {
		return this.wordNm;
	}

	public void setWordNm(String wordNm) {
		this.wordNm = wordNm;
	}

}