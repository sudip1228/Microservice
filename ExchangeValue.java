package currency.currencyexchange;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {
	
	//use "_" sign in data.sql
	@Id
	private Long id;
	
	@Column(name="currency_from")
	private String from;//you cannot have column name "from" in sql table becoz it is regarded as a syntax.
	
	@Column(name="currency_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private int port;

	
	public ExchangeValue() {
		
	}
	

	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public String getFrom() {
		return from;
	}

	public String getTo() {
		return to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	

}