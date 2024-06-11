package SingleTom;

import java.util.Objects;

class Schema implements Cloneable {
	private String SchemaName;
	private String SchemaPrice;

	public Schema() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Schema(String schemaName, String schemaPrice) {
		super();
		SchemaName = schemaName;
		SchemaPrice = schemaPrice;
	}

	public String getSchemaName() {
		return SchemaName;
	}

	public void setSchemaName(String schemaName) {
		SchemaName = schemaName;
	}

	public String getSchemaPrice() {
		return SchemaPrice;
	}

	public void setSchemaPrice(String schemaPrice) {
		SchemaPrice = schemaPrice;
	}

	@Override
	public String toString() {
		return "Schema [SchemaName=" + SchemaName + ", SchemaPrice=" + SchemaPrice + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(SchemaName, SchemaPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Schema other = (Schema) obj;
		return Objects.equals(SchemaName, other.SchemaName) && Objects.equals(SchemaPrice, other.SchemaPrice);
	}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class ProtoType {
	public static void main(String[] args) {
		Schema name = new Schema();
		name.setSchemaName("isyn");
		name.setSchemaPrice("1233");

		Schema name1 = new Schema();
		name1 = name;
		System.out.println(name1.getSchemaName());
		System.out.println(name1.getSchemaPrice());

	}
}
