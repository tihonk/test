package egg.actions.services.field.impl;

import egg.actions.services.field.RealtyService;
import egg.models.mainModels.FieldModel;
import egg.models.mainModels.UserModel;
import static egg.models.FieldStatus.WHITE_FIELD;

public class RealtyServiceImpl implements RealtyService {

    private static final Double DEFAULT_DEFENSE_FORCE = 100.0;
    private static final Double DEFAULT_ATTACK_FORCE = 0.0;

    public void giveFreeField(UserModel user){
    }

    public void buyTheField(UserModel buyerUser, FieldModel boughtField) {
    }

    private FieldModel generateFreeField(UserModel user) {
        FieldModel newFreeField = new FieldModel(WHITE_FIELD);
        newFreeField.setUser(user);
        newFreeField.setDefenseForce(DEFAULT_DEFENSE_FORCE);
        newFreeField.setAttackForce(DEFAULT_ATTACK_FORCE);
        newFreeField.setLatitude(generateLatitude());
        newFreeField.setLongitude(generateLongitude());
        return newFreeField;
    }

    private Double generateLatitude() {
        return 1.0;
    }

    private Double generateLongitude() {
        return 1.0;
    }
}
