package com.sbrf.reboot.repository;

import java.util.Objects;
import java.util.Set;

public interface AccountRepository {

    Set<Long> getAllContractsByClientId(long clientId);

    Set<Long> getBanksByContractNumber(long contractNumber);

}
