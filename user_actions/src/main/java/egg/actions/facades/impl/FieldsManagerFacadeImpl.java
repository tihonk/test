package egg.actions.facades.impl;

import egg.actions.facades.FieldsManagerFacade;
import egg.actions.services.ActionPossibilityService;
import egg.actions.services.FieldService;
import egg.models.mainModels.FieldModel;
import egg.models.mainModels.UserModel;


public abstract class FieldsManagerFacadeImpl implements FieldsManagerFacade {

    private FieldService fieldService;
    private ActionPossibilityService actionPossibilityService;

    public void getFreeField(UserModel user) {
        fieldService.getFreeField(user);
    }

    public void buyTheField(FieldModel field, UserModel user) {
        if(canUserBuyTheField(field, user)){
            userService.bueTheField(user);
            fieldService.buyTheField(field, user);
        }
    }

    public void attackTheField() {
        fieldService.attackTheField();
    }

    public void fillInTheField() {
        fieldService.fillInTheField();
    }

    public void likeTheField() {
        fieldService.likeTheField();
    }

    private boolean canUserBuyTheField(FieldModel field, UserModel user) {
        boolean isFieldFree = actionPossibilityService.isFieldFree(field);
        boolean isUserSolvent = actionPossibilityService.isUserSolventToBuyTheField(user);
        return isFieldFree && isUserSolvent;
    }
}

