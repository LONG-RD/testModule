package com.longBldg.testModule;

import javax.baja.nre.annotations.*;
import javax.baja.sys.*;
import javax.baja.status.*;
import javax.baja.control.*;

@NiagaraType

@NiagaraProperty(
        name="inA",
        type="BStatusBoolean",
        defaultValue= "new BStatusBoolean(false)",
        flags = Flags.EXECUTE_ON_CHANGE
)

@NiagaraProperty(
        name="inB",
        type="BStatusBoolean",
        defaultValue="new BStatusBoolean(false)",
        flags = Flags.EXECUTE_ON_CHANGE
)

@NiagaraProperty(
        name="inC",
        type="BStatusBoolean",
        defaultValue="new BStatusBoolean(false)",
        flags = Flags.EXECUTE_ON_CHANGE
)

/**
 * Created by Tech VM on 5/17/2018.
 */
public class BAndOr extends BBooleanPoint {
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $org.longBuild.training.BAndOr(429389039)1.0$ @*/
/* Generated Thu May 17 15:29:49 MDT 2018 by Slot-o-Matic (c) Tridium, Inc. 2012 */

////////////////////////////////////////////////////////////////
// Property "inA"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code inA} property.
     * @see #getInA
     * @see #setInA
     */
    public static final Property inA = newProperty(Flags.EXECUTE_ON_CHANGE, new BStatusBoolean(false), null);

    /**
     * Get the {@code inA} property.
     * @see #inA
     */
    public BStatusBoolean getInA() { return (BStatusBoolean)get(inA); }

    /**
     * Set the {@code inA} property.
     * @see #inA
     */
    public void setInA(BStatusBoolean v) { set(inA, v, null); }

////////////////////////////////////////////////////////////////
// Property "inB"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code inB} property.
     * @see #getInB
     * @see #setInB
     */
    public static final Property inB = newProperty(Flags.EXECUTE_ON_CHANGE, new BStatusBoolean(false), null);

    /**
     * Get the {@code inB} property.
     * @see #inB
     */
    public BStatusBoolean getInB() { return (BStatusBoolean)get(inB); }

    /**
     * Set the {@code inB} property.
     * @see #inB
     */
    public void setInB(BStatusBoolean v) { set(inB, v, null); }

////////////////////////////////////////////////////////////////
// Property "inC"
////////////////////////////////////////////////////////////////

    /**
     * Slot for the {@code inC} property.
     * @see #getInC
     * @see #setInC
     */
    public static final Property inC = newProperty(Flags.EXECUTE_ON_CHANGE, new BStatusBoolean(false), null);

    /**
     * Get the {@code inC} property.
     * @see #inC
     */
    public BStatusBoolean getInC() { return (BStatusBoolean)get(inC); }

    /**
     * Set the {@code inC} property.
     * @see #inC
     */
    public void setInC(BStatusBoolean v) { set(inC, v, null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////

    @Override
    public Type getType() { return TYPE; }
    public static final Type TYPE = Sys.loadType(BAndOr.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

    public void execute(){
        if(getInA().getValue() && getInB().getValue()){
            getOut().setValue(true);
        }
        else
        {
            getOut().setValue(false);
        }

        if(getOut().getValue() || getInC().getValue()){
            getOut().setValue(true);
        }
        else
        {
            getOut().setValue(false);
        }
    }
}

