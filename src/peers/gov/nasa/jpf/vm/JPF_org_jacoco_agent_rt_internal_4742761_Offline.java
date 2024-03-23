package gov.nasa.jpf.vm;

import gov.nasa.jpf.annotation.MJI;

public class JPF_org_jacoco_agent_rt_internal_4742761_Offline extends NativePeer {

  @MJI
  public int getProbes(MJIEnv env, int clsRef,
                       long classId, int clsNameRef, int probeCount) {
    String className = env.getStringObject(clsNameRef);
    env.getVM().getJacocoProbeData(classId, className, probeCount);

    // Dummy
    return env.newBooleanArray(probeCount);
  }
}
