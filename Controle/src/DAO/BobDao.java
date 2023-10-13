package DAO;

import JDBC.ConnectionFactory;
import Model.BobModel;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;


public class BobDao {
    private Connection conn;

    public BobDao(){
        this.conn = new ConnectionFactory().getConnection();
    }
    public boolean bobadd(BobModel bob){
        String sql = "INSERT INTO bobtail(frota,placa,tara)VALUE(?,?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1,bob.getFrota());
            stmt.setString(2,bob.getPlaca());
            stmt.setString(3,bob.getTara());
           // stmt.setString(4,bob.getMotorista());
            stmt.execute();
            stmt.close();
            conn.close();
            return true;

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return false;

    }
    public boolean bobDeleta(BobModel bobModel){
        String sql = "DELETE FROM bobtail WHERE id=?;";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setLong(1,bobModel.getId());
            stmt.execute();
            stmt.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return false;

    }

    public List<BobModel>getlist(){
        List<BobModel>bobModels = new ArrayList<>();
        String sql = "SELECT * FROM bobtail";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet r = stmt.executeQuery();
            while (r.next()) {
                BobModel bobModel = new BobModel();
                bobModel.setId(r.getLong("id"));
                bobModel.setFrota(r.getString("frota"));
                bobModel.setPlaca(r.getString("placa"));
                bobModel.setTara(r.getString("tara"));
               // bobModel.setMotorista(r.getString("motorista"));
                bobModels.add(bobModel);
            }
            stmt.close();
            r.close();
            conn.close();
        } catch (SQLException e) {

            e.printStackTrace();
            return null;
        }
        return bobModels;

    }

    public void bobdelete(BobModel selecionadaBobModel) {
    }


}
