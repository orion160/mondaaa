import javax.jdo.JDOHelper;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello");

    var pmf = JDOHelper.getPersistenceManagerFactory("BancAndes");
    var pm = pmf.getPersistenceManager();
    var tx = pm.currentTransaction();

    try
    {
      tx.begin();

      //{users code to persist objects}

      tx.commit();
    }
    finally
    {
      if (tx.isActive())
      {
        tx.rollback();
      }
      pm.close();
    }

    var query = pm.newQuery("javax.jdo.query.SQL", "SELECT MY_ID, MY_NAME FROM MYTABLE");
    //query.setClass();
    //  query.setResultClass();
    pm.close();
    pmf.close();
  }
}
