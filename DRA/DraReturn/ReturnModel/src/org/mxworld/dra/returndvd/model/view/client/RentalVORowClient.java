package org.mxworld.dra.returndvd.model.view.client;

import oracle.jbo.client.remote.RowImpl;

import org.mxworld.dra.returndvd.model.view.common.RentalVORow;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Mar 02 16:49:35 EST 2014
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class RentalVORowClient extends RowImpl implements RentalVORow {
    /**
     * This is the default constructor (do not remove).
     */
    public RentalVORowClient() {
    }

    public String registerReturn() {
        Object _ret = getApplicationModuleProxy().riInvokeExportedMethod(this, "registerReturn", null, null);
        return (String) _ret;
    }
}

