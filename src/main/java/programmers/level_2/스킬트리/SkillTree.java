package programmers.level_2.스킬트리;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49993
 */
public class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for (String skillTree : skill_trees) {
            if (isPossibleSkillTree(skill, skillTree)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isPossibleSkillTree(String skill, String skillTree) {
        StringBuilder sb = new StringBuilder();

        for (char ch : skillTree.toCharArray()) {
            String s = String.valueOf(ch);

            if (skill.contains(s)) {
                sb.append(s);
            }
        }

        String filteredSkillTree = sb.toString();

        return skill.startsWith(filteredSkillTree);
    }
}
