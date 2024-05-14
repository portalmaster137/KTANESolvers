package com.porta137.KTANESolvers.util;

public class Edgework {

    public String serialNumber;
    public Ports[] ports;
    public int BatteryCount;
    public int BatteryHolderCount;
    public Indicators[] unlitIndicators;
    public Indicators[] litIndicators;

    public Edgework(EdgeworkBuilder builder) {
        this.serialNumber = builder.serialNumber;
        this.ports = builder.ports;
        this.BatteryCount = builder.BatteryCount;
        this.BatteryHolderCount = builder.BatteryHolderCount;
        this.unlitIndicators = builder.unlitIndicators;
        this.litIndicators = builder.litIndicators;
    }

    public static class EdgeworkBuilder {
        //required params
        private final String serialNumber;

        //optional params
        //todo
        private Ports[] ports;
        private int BatteryCount;
        private int BatteryHolderCount;
        private Indicators[] unlitIndicators;
        private Indicators[] litIndicators;

        public EdgeworkBuilder(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public EdgeworkBuilder BatteryCount(int BatteryCount) {
            this.BatteryCount = BatteryCount;
            return this;
        }

        public EdgeworkBuilder BatteryHolderCount(int BatteryHolderCount) {
            this.BatteryHolderCount = BatteryHolderCount;
            return this;
        }

        public EdgeworkBuilder ports(Ports... ports) {
            this.ports = ports;
            return this;
        }

        public EdgeworkBuilder unlitIndicators(Indicators... unlitIndicators) {
            this.unlitIndicators = unlitIndicators;
            return this;
        }

        public EdgeworkBuilder litIndicators(Indicators... litIndicators) {
            this.litIndicators = litIndicators;
            return this;
        }

        public Edgework build() {
            return new Edgework(this);
        }
    }
}
