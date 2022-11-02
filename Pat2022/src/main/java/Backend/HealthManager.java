/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backend;

import java.sql.ResultSet;

/**
 *
 * @author Narita
 */
//hi
public class HealthManager {

    public HealthManager() {

    }

    //insert query
    public void insert(int sleep, int water, int exercise) {
        DB db = new DB();
        String query = "INSERT INTO HealthResult(sleep,water,exercise) VALUES(" + sleep + "," + water + "," + exercise + ")";
        db.update(query);
    }

    public void insertSleep(int sleep, int water, int exercise) {
        DB db = new DB();
        String query = "INSERT INTO HealthResult(sleep,water,exercise) VALUES(" + sleep + "," + water + "," + exercise + ")";
        db.update(query);
    }

    //delete query
    public void delete(int sleep, int water, int exercise) {
        DB db = new DB();
        String query = "DELETE FROM HealthResult(sleep,water,exercise) VALUES(" + sleep + "," + water + "," + exercise + ")";
        db.update(query);
    }

    public void deleteSleep(int sleep) {
        DB db = new DB();
        String query = "DELETE FROM `naritaaDB`.`HealthResult` WHERE (`sleep` = '" + sleep + "')";
        db.update(query);
    }

    public void deleteWater(int water) {
        DB db = new DB();
        String query = "DELETE FROM `naritaaDB`.`HealthResult` WHERE (`sleep` = '" + water + "')";
        db.update(query);
    }

    public void deleteExercise(int ex) {
        DB db = new DB();
        String query = "DELETE FROM `naritaaDB`.`HealthResult` WHERE (`sleep` = '" + ex + "')";
        db.update(query);
    }

    //update query
    public void update(int sleep, int water, int exercise) {
        DB db = new DB();
        String query = "UPDATE `naritaaDB`.`HealthResult` SET `Exercise` = '4' WHERE (`logID` = '1');";
        db.update(query);
    }

    public void updateSleep(int sleep, int water, int exercise) {
        DB db = new DB();
        String query = "UPDATE `naritaaDB`.`HealthResult` SET `Exercise` = '4' WHERE (`logID` = '1');";
        db.update(query);
    }
     public void updateWater(int sleep, int water, int exercise){
        DB db = new DB();
        String query = "UPDATE `naritaaDB`.`HealthResult` SET `Exercise` = '4' WHERE (`logID` = '1');"  ;
        db.update(query);
    }
     // value?
     //how would all queries be decided| just based on input values
     public void updateExercise(int sleep, int water, int exercise){
        DB db = new DB();
        String query = "UPDATE `naritaaDB`.`HealthResult` SET `Exercise` = '4' WHERE (`logID` = '1');"  ;
        db.update(query);
    }

    //make an average method? add to table
}
