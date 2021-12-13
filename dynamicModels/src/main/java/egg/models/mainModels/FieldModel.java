package egg.models.mainModels;

import egg.models.FieldStatus;

public class FieldModel {

    private Long id;
    private UserModel user;
    private FieldStatus status;
    private Double longitude;
    private Double latitude;
    private Double defenseForce;
    private Double attackForce;

    public FieldModel(FieldStatus status) {
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public FieldStatus getStatus() {
        return status;
    }

    public void setStatus(FieldStatus status) {
        this.status = status;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getDefenseForce() {
        return defenseForce;
    }

    public void setDefenseForce(Double defenseForce) {
        this.defenseForce = defenseForce;
    }

    public Double getAttackForce() {
        return attackForce;
    }

    public void setAttackForce(Double attackForce) {
        this.attackForce = attackForce;
    }
}
