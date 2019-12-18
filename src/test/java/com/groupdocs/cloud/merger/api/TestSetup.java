package com.groupdocs.cloud.merger.api;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    AuthApiTests.class,
    StorageApiTests.class,
    FolderApiTests.class,
    FileApiTests.class,
    MergerFormatsApiTests.class,
    MergerInfoApiTests.class,
    MergerApiTests.class,
    MergerPasswordApiTests.class
})

public class TestSetup {
    

}
