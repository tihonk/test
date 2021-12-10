package egg.actions.services.impl;

import egg.actions.repository.FieldRepository;
import egg.actions.services.FieldService;
import egg.models.mainModels.FieldModel;
import egg.models.mainModels.UserModel;

import static egg.models.FieldStatus.WHITE_FIELD;

public class FieldServiceImpl implements FieldService {

    private static final Double DEFAULT_DEFENSE_FORCE = 100.0;
    private static final Double DEFAULT_ATTACK_FORCE = 0.0;

    private FieldRepository repository;

    public void getFreeField(UserModel user) {
        FieldModel newField = generateFreeField(user);
        repository.save(newField);
    }

    public void buyTheField(FieldModel field, UserModel user) {
        field.setUser(user);
        repository.save(field);
    }

    public void attackTheField() {

    }

    public void fillInTheField() {

    }

    public void likeTheField() {

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
