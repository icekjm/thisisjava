package ch08;

public class OracleDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");

	}

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dbwork() {
		// TODO Auto-generated method stub

	}

}
