package strategy;

import enums.ShareAction;

public interface ShareStrategy {
    void share(String content);
    boolean isApplicable(ShareAction shareAction);
}
