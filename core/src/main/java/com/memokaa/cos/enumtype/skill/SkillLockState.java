package com.memokaa.cos.enumtype.skill;

/**
 * Skill davranış durumu.
 *
 * UP     -> Skill artabilir.
 * DOWN   -> Skill azaltılabilir.
 * LOCKED -> Skill değeri değişmez.
 */
public enum SkillLockState {

    UP,
    DOWN,
    LOCKED
}
