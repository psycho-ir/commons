package com.samenea.commons.component;

import com.samenea.commons.component.utils.test.AbstractAcceptanceTestExecutionListener;

public class AcceptanceTestExecutionListener extends AbstractAcceptanceTestExecutionListener {

    @Override
    protected String getDatasourceName() {
        return "dataSource";
    }

    @Override
    protected String getXmlDataFileLoaderName() {
        return "fullXmlDataFileLoader";
    }

}
