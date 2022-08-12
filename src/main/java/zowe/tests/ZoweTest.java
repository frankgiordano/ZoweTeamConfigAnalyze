package zowe.tests;

import zowe.model.ProfileDao;
import zowe.teamconfig.api.Zowe;
import zowe.service.KeyTarService;
import zowe.service.TeamConfigService;

public class ZoweTest {

    public static void main(String[] args) throws Exception {
        Zowe zowe = new Zowe(new KeyTarService(), new TeamConfigService());
        ProfileDao profileDao = zowe.getDefaultProfileByName("zosmf");
        System.out.println(profileDao);
    }

}
